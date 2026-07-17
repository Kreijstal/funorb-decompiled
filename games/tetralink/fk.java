/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

class fk extends ae {
    private va field_X;
    private je field_T;
    static uf field_Q;
    private String[] field_P;
    static hl field_V;
    static int field_S;
    static String field_Y;
    static ah field_U;
    static int field_W;
    static String field_R;

    boolean a(na param0, int param1) {
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
            if (param1 == -384169950) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_R = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("fk.EB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0) {
        int var2 = 0;
        jh var3 = null;
        hi var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        bk var12 = null;
        int var13 = 0;
        int var14 = 0;
        va var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var16 = TetraLink.field_J;
        ((fk) this).field_T = new je();
        var2 = 0;
        var3 = (jh) (Object) ((fk) this).field_H;
        if (param0 == -1) {
          var4 = var3.a((na) this, false);
          L0: while (true) {
            var5 = ((fk) this).field_A.indexOf("<hotspot=", var2);
            if (var5 == -1) {
              return;
            } else {
              var7 = ((fk) this).field_A.indexOf(">", var5);
              var6 = ((fk) this).field_A.substring(9 + var5, var7);
              var7 = Integer.parseInt(var6);
              var2 = ((fk) this).field_A.indexOf("</hotspot>", var5);
              var8 = var4.a(var5, 112);
              var9 = var4.a(var2, param0 ^ -122);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var11 > var9) {
                  continue L0;
                } else {
                  L2: {
                    var12 = var4.field_c[var11];
                    if (var11 != var8) {
                      stackOut_8_0 = var12.field_j[0];
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = var4.a(var5, true);
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_9_0;
                    if (var11 != var9) {
                      if (var12 == null) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        break L3;
                      } else {
                        stackOut_12_0 = var12.field_j[-1 + var12.field_j.length];
                        stackIn_14_0 = stackOut_12_0;
                        break L3;
                      }
                    } else {
                      stackOut_10_0 = var4.a(var2, true);
                      stackIn_14_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_14_0;
                    var15 = new va(var7, var13, var12.field_h, -var13 + var14, Math.max(var3.a(true), var12.field_a + -var12.field_h));
                    if (var10 != null) {
                      ((va) var10).field_v = var15;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((fk) this).field_T.a((mc) (Object) var15, false);
                  var10 = (Object) (Object) var15;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void c(int param0, int param1, int param2, int param3) {
        ((fk) this).a(((jh) (Object) ((fk) this).field_H).a((na) this, 80), param2, 23, param1, param0);
        if (param3 >= -13) {
            field_S = -14;
        }
    }

    private final va b(int param0, byte param1, int param2) {
        va var4 = null;
        va var5 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        var4 = (va) (Object) ((fk) this).field_T.c(false);
        if (param1 >= 92) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (va) (Object) ((fk) this).field_T.a((byte) -70);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_o > param0) {
                      break L2;
                    } else {
                      if (var5.field_s > param2) {
                        break L2;
                      } else {
                        if (var5.field_o + var5.field_r <= param0) {
                          break L2;
                        } else {
                          if (var5.field_x + var5.field_s < param2) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_v;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void e(byte param0) {
        if (!(!hi.field_a)) {
            go.c((byte) 42);
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param3 == param0)) {
            return;
        }
        jh var5 = (jh) (Object) ((fk) this).field_H;
        va var6 = ((fk) this).field_X;
        if (var6 == null) {
        } else {
            var7 = var5.a(param1, param0, (na) this);
            var8 = var5.a((na) this, param2, true);
            do {
                id.a(var6.field_r + 2, var6.field_s + var8 + -2, 0, var6.field_x - -2, -2 + (var6.field_o + var7));
                var6 = var6.field_v;
            } while (var6 != null);
        }
    }

    String e(int param0) {
        if (param0 != 0) {
            field_V = null;
        }
        if (null == ((fk) this).field_X) {
            return null;
        }
        if (null == ((fk) this).field_P) {
            return null;
        }
        if (((fk) this).field_P.length <= ((fk) this).field_X.field_w) {
            return null;
        }
        return ((fk) this).field_P[((fk) this).field_X.field_w];
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = -21 / ((-61 - param2) / 51);
        super.a(param0, param1, -126, param3, param4);
        ((fk) this).a(-1);
    }

    final static boolean a(int param0, byte param1, int param2, int param3) {
        if (param3 < 0) {
          return false;
        } else {
          if (param3 <= 11) {
            L0: {
              if (param2 < 1) {
                break L0;
              } else {
                if (oj.a(param3, param0, 10121) >= param2) {
                  L1: {
                    if (param1 == -40) {
                      break L1;
                    } else {
                      field_R = null;
                      break L1;
                    }
                  }
                  return true;
                } else {
                  break L0;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    public static void g(int param0) {
        field_R = null;
        field_Q = null;
        field_U = null;
        field_V = null;
        field_Y = null;
    }

    final static int[] a(int param0, byte param1, int param2) {
        if (param1 != -67) {
            return null;
        }
        int var3 = le.d(param2, -28583);
        int var4 = ua.a(param1 ^ 61, param2);
        int var5 = le.d(param0, -28583);
        int var6 = ua.a(109, param0);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    void a(na param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              ((fk) this).field_X = null;
              if (param3) {
                break L1;
              } else {
                boolean discarded$3 = fk.a(-113, (byte) -121, 13, -15);
                break L1;
              }
            }
            L2: {
              if (((fk) this).field_r) {
                var5_int = -((fk) this).field_t + aa.field_Nb + -param1;
                var6 = a.field_a + -param2 + -((fk) this).field_w;
                ((fk) this).field_X = this.b(var5_int, (byte) 126, var6);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("fk.MA(");
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
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = param1 - ((fk) this).field_t;
        int var6 = -((fk) this).field_w + param0;
        va var7 = this.b(var5, (byte) 119, var6);
        if (var7 != null) {
            if (!(((fk) this).field_s == null)) {
                ((ij) (Object) ((fk) this).field_s).a(var7.field_w, (byte) -103, (fk) this, param3);
            }
        }
    }

    fk(String param0, kg param1) {
        super(param0, (dn) null);
        ((fk) this).field_X = null;
        try {
            ((fk) this).field_H = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "fk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, String param1, byte param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var6 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (((fk) this).field_P == null) {
                  break L2;
                } else {
                  if (((fk) this).field_P.length <= param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param0];
                var8 = var7;
                var4 = var8;
                if (((fk) this).field_P != null) {
                  var5 = 0;
                  L4: while (true) {
                    if (((fk) this).field_P.length <= var5) {
                      break L3;
                    } else {
                      var7[var5] = ((fk) this).field_P[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((fk) this).field_P = var8;
              break L1;
            }
            L5: {
              ((fk) this).field_P[param0] = param1;
              if (param2 == -127) {
                break L5;
              } else {
                field_W = -57;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("fk.G(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, Throwable param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            vl var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            ie stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            ie stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            ie stackIn_16_0 = null;
            int stackIn_16_1 = 0;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            java.net.URL stackIn_16_4 = null;
            StringBuilder stackIn_16_5 = null;
            String stackIn_16_6 = null;
            Throwable decompiledCaughtException = null;
            ie stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            ie stackOut_15_0 = null;
            int stackOut_15_1 = 0;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            java.net.URL stackOut_15_4 = null;
            StringBuilder stackOut_15_5 = null;
            String stackOut_15_6 = null;
            ie stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            var6 = TetraLink.field_J;
            try {
              L0: {
                L1: {
                  if (param0 < -38) {
                    break L1;
                  } else {
                    field_V = null;
                    break L1;
                  }
                }
                L2: {
                  var3_ref = "";
                  if (param1 == null) {
                    break L2;
                  } else {
                    var3_ref = da.a((byte) 118, param1);
                    break L2;
                  }
                }
                L3: {
                  if (param2 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (param1 != null) {
                        var3_ref = var3_ref + " | ";
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L3;
                  }
                }
                sn.a((byte) 127, var3_ref);
                var7 = n.a(true, ":", "%3a", var3_ref);
                var8 = n.a(true, "@", "%40", var7);
                var9 = n.a(true, "&", "%26", var8);
                var10 = n.a(true, "#", "%23", var9);
                if (lc.field_h == null) {
                  return;
                } else {
                  L5: {
                    stackOut_13_0 = pj.field_b;
                    stackOut_13_1 = 0;
                    stackOut_13_2 = null;
                    stackOut_13_3 = null;
                    stackOut_13_4 = lc.field_h.getCodeBase();
                    stackOut_13_5 = new StringBuilder().append("clienterror.ws?c=").append(cc.field_f).append("&u=");
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_15_3 = stackOut_13_3;
                    stackIn_15_4 = stackOut_13_4;
                    stackIn_15_5 = stackOut_13_5;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    stackIn_14_3 = stackOut_13_3;
                    stackIn_14_4 = stackOut_13_4;
                    stackIn_14_5 = stackOut_13_5;
                    if (null == um.field_m) {
                      stackOut_15_0 = (ie) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = null;
                      stackOut_15_3 = null;
                      stackOut_15_4 = (java.net.URL) (Object) stackIn_15_4;
                      stackOut_15_5 = (StringBuilder) (Object) stackIn_15_5;
                      stackOut_15_6 = "" + kk.field_U;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      stackIn_16_4 = stackOut_15_4;
                      stackIn_16_5 = stackOut_15_5;
                      stackIn_16_6 = stackOut_15_6;
                      break L5;
                    } else {
                      stackOut_14_0 = (ie) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = null;
                      stackOut_14_3 = null;
                      stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                      stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                      stackOut_14_6 = um.field_m;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      stackIn_16_4 = stackOut_14_4;
                      stackIn_16_5 = stackOut_14_5;
                      stackIn_16_6 = stackOut_14_6;
                      break L5;
                    }
                  }
                  var4 = ((ie) (Object) stackIn_16_0).a(stackIn_16_1 != 0, new java.net.URL(stackIn_16_4, stackIn_16_6 + "&v1=" + ie.field_v + "&v2=" + ie.field_x + "&e=" + var10));
                  L6: while (true) {
                    if (var4.field_d != 0) {
                      L7: {
                        if (var4.field_d == 1) {
                          var5 = (DataInputStream) var4.field_f;
                          int discarded$1 = var5.read();
                          var5.close();
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      break L0;
                    } else {
                      tb.a(false, 1L);
                      continue L6;
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L8;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new uf();
        field_Y = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_W = -1;
        field_R = "Invalid password.";
    }
}
