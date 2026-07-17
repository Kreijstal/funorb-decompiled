/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sb extends pc {
    private int field_D;
    private n field_H;
    static sj field_E;
    static String field_C;
    static dl[] field_B;
    static volatile int field_I;
    static int field_F;

    final String a(byte param0) {
        if (!(!((sb) this).field_m)) {
            return ((sb) this).field_H.a(-16774);
        }
        if (param0 < -23) {
            return null;
        }
        sb.e((byte) -41);
        return null;
    }

    final static String a(int param0, DataInputStream param1) throws IOException {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var2_int = param1.readInt();
            var3 = var2_int >>> 24;
            var2_int = var2_int & 16777215;
            if (var3 <= 1) {
              var4 = new byte[var2_int];
              param1.readFully(var4);
              if (param0 <= var3) {
                stackOut_5_0 = db.a((byte) 109, var4);
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_3_0 = fa.a((byte) -80, var4);
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0;
              }
            } else {
              throw new RuntimeException("Unsupported string version number: " + var3);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("sb.L(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            ((sb) this).field_D = ((sb) this).field_D + 1;
            int var5_int = -82 % ((param1 - -50) / 59);
            super.a(param0, -121, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "sb.N(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_B = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("sb.P(").append(param0).append(44);
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final static void a(db param0, int param1) {
        try {
            if (param1 != 18180) {
                Object var3 = null;
                sb.a((db) null, 6);
            }
            hb.field_k = bl.a(param0, "initialset", "level-lost").a();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "sb.O(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void e(byte param0) {
        if (param0 != 2) {
          field_C = null;
          field_B = null;
          field_C = null;
          field_E = null;
          return;
        } else {
          field_B = null;
          field_C = null;
          field_E = null;
          return;
        }
    }

    sb(n param0) {
        try {
            ((sb) this).field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "sb.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        oi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dl var14 = null;
        dl var15 = null;
        dl var16 = null;
        dl var17 = null;
        dl var18 = null;
        dl var20 = null;
        dl var21 = null;
        dl var22 = null;
        var11 = CrazyCrystals.field_B;
        super.a(param0, (byte) -110, param2, param3);
        if (param3 == 0) {
          var5 = (((sb) this).field_g >> 1) + (((sb) this).field_r + param2);
          var6 = (((sb) this).field_f >> 1) + (param0 - -((sb) this).field_j);
          if (param1 < -12) {
            L0: {
              var8 = ((sb) this).field_H.c((byte) 45);
              if (var8 == ta.field_h) {
                break L0;
              } else {
                if (var8 == ec.field_h) {
                  break L0;
                } else {
                  if (var8 != rk.field_c) {
                    if (ih.field_b == var8) {
                      var21 = ao.field_b[1];
                      var21.d(-(var21.field_l >> 1) + var5, -(var21.field_u >> 1) + var6, 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var20 = ao.field_b[2];
                    var20.d(-(var20.field_l >> 1) + var5, -(var20.field_u >> 1) + var6, 256);
                    return;
                  }
                }
              }
            }
            var22 = ao.field_b[0];
            var9 = var22.field_n << 1;
            var10 = var22.field_o << 1;
            if (null != tk.field_l) {
              if (var9 <= tk.field_l.field_l) {
                if (tk.field_l.field_u < var10) {
                  tk.field_l = new dl(var9, var10);
                  em.a((byte) 38, tk.field_l);
                  var22.a(112, 144, var22.field_n << 4, var22.field_o << 4, -((sb) this).field_D << 10, 4096);
                  lg.a(1);
                  tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
                  return;
                } else {
                  em.a((byte) 38, tk.field_l);
                  kh.a();
                  var22.a(112, 144, var22.field_n << 4, var22.field_o << 4, -((sb) this).field_D << 10, 4096);
                  lg.a(1);
                  tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
                  return;
                }
              } else {
                tk.field_l = new dl(var9, var10);
                em.a((byte) 38, tk.field_l);
                var22.a(112, 144, var22.field_n << 4, var22.field_o << 4, -((sb) this).field_D << 10, 4096);
                lg.a(1);
                tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
                return;
              }
            } else {
              tk.field_l = new dl(var9, var10);
              em.a((byte) 38, tk.field_l);
              var22.a(112, 144, var22.field_n << 4, var22.field_o << 4, -((sb) this).field_D << 10, 4096);
              lg.a(1);
              tk.field_l.d(-var22.field_n + var5, -var22.field_o + var6, 256);
              return;
            }
          } else {
            field_C = null;
            var8 = ((sb) this).field_H.c((byte) 45);
            if (var8 != ta.field_h) {
              if (var8 != ec.field_h) {
                if (var8 != rk.field_c) {
                  if (ih.field_b == var8) {
                    var18 = ao.field_b[1];
                    var18.d(-(var18.field_l >> 1) + var5, -(var18.field_u >> 1) + var6, 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var17 = ao.field_b[2];
                  var17.d(-(var17.field_l >> 1) + var5, -(var17.field_u >> 1) + var6, 256);
                  return;
                }
              } else {
                L1: {
                  L2: {
                    var16 = ao.field_b[0];
                    var14 = var16;
                    var9 = var16.field_n << 1;
                    var10 = var16.field_o << 1;
                    if (null == tk.field_l) {
                      break L2;
                    } else {
                      if (var9 > tk.field_l.field_l) {
                        break L2;
                      } else {
                        if (tk.field_l.field_u >= var10) {
                          em.a((byte) 38, tk.field_l);
                          kh.a();
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  tk.field_l = new dl(var9, var10);
                  em.a((byte) 38, tk.field_l);
                  break L1;
                }
                var16.a(112, 144, var16.field_n << 4, var16.field_o << 4, -((sb) this).field_D << 10, 4096);
                lg.a(1);
                tk.field_l.d(-var16.field_n + var5, -var16.field_o + var6, 256);
                return;
              }
            } else {
              L3: {
                L4: {
                  var15 = ao.field_b[0];
                  var9 = var15.field_n << 1;
                  var10 = var15.field_o << 1;
                  if (null == tk.field_l) {
                    break L4;
                  } else {
                    if (var9 > tk.field_l.field_l) {
                      break L4;
                    } else {
                      if (tk.field_l.field_u >= var10) {
                        em.a((byte) 38, tk.field_l);
                        kh.a();
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                tk.field_l = new dl(var9, var10);
                em.a((byte) 38, tk.field_l);
                break L3;
              }
              var15.a(112, 144, var15.field_n << 4, var15.field_o << 4, -((sb) this).field_D << 10, 4096);
              lg.a(1);
              tk.field_l.d(-var15.field_n + var5, -var15.field_o + var6, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new sj(8, 0, 4, 1);
        field_C = "To Customer Support";
        field_I = 0;
    }
}
