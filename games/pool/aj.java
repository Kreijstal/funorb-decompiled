/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends vh {
    private int field_Lb;
    private vh field_Qb;
    private StringBuilder field_Nb;
    private vh field_Pb;
    static int[][][] field_Ob;
    static String field_Tb;
    static String field_Rb;
    static ao field_Mb;
    static String field_Sb;

    final static dd f(byte param0) {
        int var4_int = 0;
        int var5 = Pool.field_O;
        int var1 = rc.field_f[0] * pd.field_a[0];
        byte[] var2 = v.field_b[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = ma.field_h[rb.b((int) var2[var4_int], 255)];
        }
        dd var4 = new dd(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], var3);
        if (param0 != 89) {
            dd discarded$0 = aj.f((byte) 30);
        }
        sh.h(-1);
        return var4;
    }

    aj(int param0, int param1, int param2, int param3, String param4, vh param5, vh param6, vh param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((aj) this).field_Lb = 0;
        try {
          L0: {
            ((aj) this).field_Pb = new vh(0L, param6, param4);
            ((aj) this).a(117, ((aj) this).field_Pb);
            ((aj) this).field_Qb = new vh(0L, param7);
            ((aj) this).field_Qb.field_N = 16764006;
            ((aj) this).a(-126, ((aj) this).field_Qb);
            ((aj) this).field_Qb.field_kb = "|";
            ((aj) this).field_Nb = new StringBuilder(12);
            var9_int = ((aj) this).field_Pb.b(true);
            ((aj) this).field_Pb.b(3, 2147483647, 5, var9_int, ad.field_x);
            ((aj) this).field_Qb.b(ad.field_x + 3, 2147483647, 5, var9_int, ad.field_x);
            var10 = 5 + (5 - -var9_int);
            var11 = 3 + (2 * ad.field_x + 3);
            var12 = de.a(var10, param2, param0, 0);
            var13 = sh.a(var11, param1, -1, param3);
            ((aj) this).b(var13, 2147483647, var12, var10, var11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("aj.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    public static void c() {
        field_Ob = null;
        field_Sb = null;
        field_Mb = null;
        field_Rb = null;
        field_Tb = null;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = param2 >> 31 & -1 + param1;
        return (param2 - -(param2 >>> 31)) % param1 - -var3;
    }

    final static dd[] a(int param0, String param1, di param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        dd[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
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
        dd[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var4_int = param2.b(param1, param0 + -1);
            var5 = param2.a(var4_int, param0, param3);
            stackOut_0_0 = ln.a(var4_int, (byte) 110, param2, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("aj.E(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var5 = null;
            String var4 = null;
            try {
                om.field_y = param2;
                try {
                    var3 = param0.getParameter("cookieprefix");
                    var5 = var3;
                    var5 = var3;
                    var4 = param0.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    if (param2.length() == 0) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    int discarded$0 = 35;
                    mo.a("document.cookie=\"" + var5 + "\"", param0);
                } catch (Throwable throwable) {
                }
                uk.a(558370049, param0);
            } catch (RuntimeException runtimeException) {
                throw wm.a((Throwable) (Object) runtimeException, "aj.D(" + (param0 != null ? "{...}" : "null") + 44 + -18788 + 44 + (param2 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean f(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (((aj) this).field_Lb != 0) {
          return false;
        } else {
          L0: {
            if (param0 == 20628) {
              break L0;
            } else {
              var3 = null;
              ml discarded$13 = aj.a((java.applet.Applet) null, 1);
              break L0;
            }
          }
          L1: {
            if (85 != qi.field_a) {
              break L1;
            } else {
              if (((aj) this).field_Nb.length() > 0) {
                StringBuilder discarded$14 = cj.a(' ', ((aj) this).field_Nb.length() + -1, -2790, ((aj) this).field_Nb);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((aj) this).field_Nb.length() >= 12) {
              break L2;
            } else {
              L3: {
                var2 = Character.toLowerCase(ml.field_b);
                if (var2 == 32) {
                  var2 = 95;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var2 != 95) {
                  break L4;
                } else {
                  if (((aj) this).field_Nb.length() > 0) {
                    StringBuilder discarded$15 = ((aj) this).field_Nb.append(var2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                int discarded$16 = 22987;
                if (vq.a((char) var2)) {
                  break L5;
                } else {
                  if (!kh.a((char) var2, (byte) 85)) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              StringBuilder discarded$17 = ((aj) this).field_Nb.append(var2);
              break L2;
            }
          }
          L6: {
            if (qi.field_a != 84) {
              break L6;
            } else {
              if (((aj) this).field_Nb.length() <= 0) {
                ((aj) this).field_Lb = 1;
                break L6;
              } else {
                ((aj) this).field_nb = ((aj) this).field_Nb.toString();
                ((aj) this).field_Lb = 2;
                break L6;
              }
            }
          }
          if (13 == qi.field_a) {
            ((aj) this).field_Lb = 1;
            return true;
          } else {
            return true;
          }
        }
    }

    final static ml a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ml[] var3 = null;
        int var4 = 0;
        ml var5 = null;
        ml stackIn_4_0 = null;
        ml stackIn_9_0 = null;
        ml stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_11_0 = null;
        ml stackOut_8_0 = null;
        ml stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var2 = re.a(-21721, "jagex-last-login-method", param0);
              if (param1 == 5137) {
                break L1;
              } else {
                int discarded$4 = aj.a(-103, false, 80);
                break L1;
              }
            }
            if (var2 != null) {
              int discarded$5 = -66;
              var3 = to.a();
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackOut_11_0 = ve.field_l;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (!var5.a(var2, (byte) 49)) {
                    var4++;
                    continue L2;
                  } else {
                    stackOut_8_0 = (ml) var5;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            } else {
              stackOut_3_0 = ve.field_l;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("aj.B(");
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
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static int a(int param0, boolean param1, int param2) {
        long var3 = 0L;
        Object var5 = null;
        L0: {
          L1: {
            var3 = (long)param2 * (long)param0;
            if ((255L & var3 >> 47) == 0L) {
              break L1;
            } else {
              if (255L == (255L & var3 >> 47)) {
                break L1;
              } else {
                var3 = ((long)param2 >> 8) * ((long)param0 >> 8);
                break L0;
              }
            }
          }
          var3 = var3 >> 16;
          break L0;
        }
        L2: {
          if (!param1) {
            break L2;
          } else {
            var5 = null;
            dd[] discarded$1 = aj.a(23, (String) null, (di) null, (String) null);
            break L2;
          }
        }
        L3: {
          if (0 <= param2) {
            break L3;
          } else {
            if (0 <= param0) {
              break L3;
            } else {
              if (var3 >= 0L) {
                break L3;
              } else {
                throw new IllegalStateException("Overflow: Multiplied two negative numbers (?!) mul(" + param2 + "[" + pf.b(126, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(126, param0) + ", " + Integer.toString(param0, 16) + "]) and got a negative number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
              }
            }
          }
        }
        L4: {
          L5: {
            L6: {
              if (0 >= param2) {
                break L6;
              } else {
                if (0 > param0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (param2 >= 0) {
              break L4;
            } else {
              if (param0 <= 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          if (var3 <= 0L) {
            break L4;
          } else {
            throw new IllegalStateException("Overflow: Multiplied a negative and positive mul(" + param2 + "[" + pf.b(127, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(126, param0) + ", " + Integer.toString(param0, 16) + "]) and got a positive number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
          }
        }
        L7: {
          if (param2 <= 0) {
            break L7;
          } else {
            if (0 >= param0) {
              break L7;
            } else {
              if (var3 < 0L) {
                throw new IllegalStateException("Overflow: Multiplied two positive numbers mul(" + param2 + "[" + pf.b(126, param2) + ", " + Integer.toString(param2, 16) + "], " + param0 + "[" + pf.b(127, param0) + ", " + Integer.toString(param0, 16) + "]) and got a negative number: " + var3 + "[" + cr.a((byte) 89, var3) + ", " + Long.toString(var3, 16) + "]");
              } else {
                break L7;
              }
            }
          }
        }
        return (int)var3;
    }

    final int a(boolean param0, byte param1) {
        int var4 = 0;
        var4 = Pool.field_O;
        ((aj) this).a(param0, false);
        if (param1 < -74) {
          L0: {
            if (!param0) {
              break L0;
            } else {
              L1: while (true) {
                if (!n.h(127)) {
                  break L0;
                } else {
                  L2: {
                    if (85 != qi.field_a) {
                      break L2;
                    } else {
                      if (((aj) this).field_Nb.length() > 0) {
                        StringBuilder discarded$11 = cj.a(' ', -1 + ((aj) this).field_Nb.length(), -2790, ((aj) this).field_Nb);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      int discarded$12 = 15692;
                      if (he.a(ml.field_b, (CharSequence) (Object) ((aj) this).field_Nb)) {
                        break L4;
                      } else {
                        L5: {
                          if (((aj) this).field_Nb.length() != 0) {
                            break L5;
                          } else {
                            if (ml.field_b == 91) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (1 != ((aj) this).field_Nb.length()) {
                            break L6;
                          } else {
                            if (ml.field_b == 35) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (ml.field_b != 93) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    StringBuilder discarded$13 = ((aj) this).field_Nb.append(ml.field_b);
                    break L3;
                  }
                  if (qi.field_a == 84) {
                    if (((aj) this).field_Nb.length() <= 0) {
                      return 1;
                    } else {
                      ((aj) this).field_nb = ((aj) this).field_Nb.toString();
                      return 2;
                    }
                  } else {
                    if (13 != qi.field_a) {
                      continue L1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          }
          L7: {
            ((aj) this).field_Qb.field_nb = ((aj) this).field_Nb.toString();
            if (!param0) {
              break L7;
            } else {
              if (0 == ne.field_s) {
                break L7;
              } else {
                if (((aj) this).field_R == 0) {
                  ((aj) this).field_Lb = 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
          }
          return ((aj) this).field_Lb;
        } else {
          return -46;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_Tb = "Next";
        field_Rb = "You do not have a suitable number of players for the current options.";
        field_Ob = new int[5][][];
        field_Ob[0] = new int[10][];
        field_Ob[1] = new int[10][];
        field_Ob[3] = new int[10][];
        field_Ob[2] = new int[10][];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 5) {
            field_Sb = "Waiting for music";
            return;
          } else {
            if (field_Ob[var0] == null) {
              field_Ob[var0] = field_Ob[0];
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
