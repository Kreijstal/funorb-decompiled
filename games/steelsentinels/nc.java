/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    static String field_p;
    static int field_d;
    static int field_f;
    static String field_g;
    static boolean field_b;
    static h field_e;
    private int field_l;
    static String field_i;
    static int field_a;
    static String[] field_m;
    static int[] field_h;
    private int field_c;
    private hb field_k;
    static a field_j;
    private q field_o;
    static boolean field_q;
    static gh field_n;

    private final void a(byte param0, int param1, Object param2, long param3) {
        bg var8 = null;
        le var6 = null;
        int var7 = SteelSentinels.field_G;
        try {
            if (((nc) this).field_c < param1) {
                throw new IllegalStateException();
            }
            this.a((byte) 117, param3);
            ((nc) this).field_l = ((nc) this).field_l - param1;
            while (((nc) this).field_l < 0) {
                var8 = (bg) (Object) ((nc) this).field_k.a(12515);
                this.a(var8, -17389);
            }
            var6 = new le(param2, param1);
            ((nc) this).field_o.a((ck) (Object) var6, param3, false);
            ((nc) this).field_k.a((byte) 47, (kd) (Object) var6);
            ((bg) (Object) var6).field_w = 0L;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nc.D(" + -109 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a() {
        field_m = null;
        field_g = null;
        field_p = null;
        field_e = null;
        field_n = null;
        field_j = null;
        field_h = null;
        field_i = null;
    }

    private final void a(byte param0, long param1) {
        bg var4 = (bg) (Object) ((nc) this).field_o.a(param1, (byte) -125);
        this.a(var4, -17389);
    }

    final Object a(long param0, int param1) {
        le var6 = null;
        Object var7 = null;
        bg var8 = null;
        Object var9 = null;
        Object var10 = null;
        var8 = (bg) (Object) ((nc) this).field_o.a(param0, (byte) -127);
        if (var8 != null) {
          if (param1 <= -30) {
            var10 = var8.d((byte) 125);
            if (var10 == null) {
              var8.b(4);
              var8.e(480);
              ((nc) this).field_l = ((nc) this).field_l + var8.field_z;
              return null;
            } else {
              if (var8.h(-29304)) {
                var6 = new le(var10, var8.field_z);
                ((nc) this).field_o.a((ck) (Object) var6, var8.field_j, false);
                ((nc) this).field_k.a((byte) 72, (kd) (Object) var6);
                ((bg) (Object) var6).field_w = 0L;
                var8.b(4);
                var8.e(480);
                return var10;
              } else {
                ((nc) this).field_k.a((byte) 50, (kd) (Object) var8);
                var8.field_w = 0L;
                return var10;
              }
            }
          } else {
            var7 = null;
            this.a((bg) null, -108);
            var9 = var8.d((byte) 125);
            if (var9 == null) {
              var8.b(4);
              var8.e(480);
              ((nc) this).field_l = ((nc) this).field_l + var8.field_z;
              return null;
            } else {
              if (var8.h(-29304)) {
                var6 = new le(var9, var8.field_z);
                ((nc) this).field_o.a((ck) (Object) var6, var8.field_j, false);
                ((nc) this).field_k.a((byte) 72, (kd) (Object) var6);
                ((bg) (Object) var6).field_w = 0L;
                var8.b(4);
                var8.e(480);
                return var9;
              } else {
                ((nc) this).field_k.a((byte) 50, (kd) (Object) var8);
                var8.field_w = 0L;
                return var9;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void a(bg param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                param0.b(param1 ^ -17385);
                param0.e(param1 + 17869);
                ((nc) this).field_l = ((nc) this).field_l + param0.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == -17389) {
              break L0;
            } else {
              var4 = null;
              nc.a((byte) -12, (java.applet.Applet) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("nc.K(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final static ld a(byte[] param0) {
        ld var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        ld stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ld stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 != null) {
              var2 = new ld(param0, rl.field_a, oa.field_M, le.field_L, ca.field_r, ba.field_d, dl.field_L);
              int discarded$2 = 9324;
              uh.a();
              stackOut_3_0 = (ld) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ld) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("nc.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 7045 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        Object var4 = null;
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
              if (ch.field_O == null) {
                break L1;
              } else {
                ch.field_O.m(105);
                break L1;
              }
            }
            jd.field_kb = new pm(param0, param1, false, true, true);
            ci.field_a.c((lh) (Object) jd.field_kb, -22908735);
            if (param2 < -37) {
              break L0;
            } else {
              var4 = null;
              nc.a((byte) 60, (java.applet.Applet) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("nc.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final void a(long param0, Object param1, int param2) {
        try {
            this.a((byte) -109, param2, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nc.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    nc(int param0) {
        this(param0, param0);
    }

    final static vc[] a(int param0, pn param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        vc[] var4 = null;
        int var5 = 0;
        vc var6 = null;
        int var7 = 0;
        wj var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        vc[] stackIn_4_0 = null;
        vc[] stackIn_10_0 = null;
        vc[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc[] stackOut_3_0 = null;
        vc[] stackOut_15_0 = null;
        vc[] stackOut_9_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (!param1.b(-35)) {
              stackOut_3_0 = new vc[]{};
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var8 = param1.a(-30756);
              L1: while (true) {
                if (var8.field_a != 0) {
                  if (var8.field_a != 2) {
                    var12 = (int[]) var8.field_c;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new vc[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var4.length <= var5) {
                        stackOut_15_0 = (vc[]) var4;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        var6 = new vc();
                        var4[var5] = var6;
                        var6.field_a = var3[var5 << 2];
                        var6.field_g = var3[1 + (var5 << 2)];
                        var6.field_j = var3[(var5 << 2) + 2];
                        var6.field_i = var3[(var5 << 2) + 3];
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_9_0 = new vc[]{};
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                } else {
                  a.a((byte) 121, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("nc.G(").append(38).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
                  param1.getAppletContext().showDocument(ge.a(0, var2, param1), "_top");
                  var3 = 58 % ((-15 - param0) / 42);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("nc.E(").append(param0).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private nc(int param0, int param1) {
        int var3 = 0;
        ((nc) this).field_k = new hb();
        ((nc) this).field_l = param0;
        ((nc) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((nc) this).field_o = new q(var3);
              return;
            }
          } else {
            ((nc) this).field_o = new q(var3);
            return;
          }
        }
    }

    final static gk a(int param0, byte param1) {
        if (param0 < 35) {
          if (param1 >= -93) {
            return null;
          } else {
            return ie.field_d[param0];
          }
        } else {
          return bl.field_p[param0 - 35];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_d = 0;
        field_h = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_p = "Unable to add name - system busy";
        field_m = new String[]{"speed_icons", "diff_icons", "map_icons"};
        field_i = "Email (Login):";
        field_q = false;
        field_g = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
