/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bc extends kf {
    private String[] field_G;
    private wl field_I;
    static String field_J;
    static String[] field_E;
    private ng field_K;
    static fi field_H;
    static String[] field_L;
    static dg field_F;

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        wl var7;
        super.a(param0, param1, param2, param3);
        var5 = -this.field_t + param3;
        var6 = param1 - this.field_o;
        var7 = this.a(var6, false, var5);
        if (var7 != null) {
          if (this.field_r != null) {
            ((ue) ((Object) this.field_r)).a(123, (bc) (this), var7.field_o, param2);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void f(boolean param0) {
        wl discarded$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int var2;
        ub var3;
        ve var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        int var11;
        rj var12;
        int var13;
        int var14;
        wl var15;
        int var16;
        var16 = Lexicominos.field_L ? 1 : 0;
        this.field_K = new ng();
        var2 = 0;
        var3 = (ub) ((Object) this.field_i);
        var4 = var3.a((w) (this), (byte) -111);
        L0: while (true) {
          var5 = this.field_u.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = this.field_u.indexOf(">", var5);
            var6 = this.field_u.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = this.field_u.indexOf("</hotspot>", var5);
            var8 = var4.a(28276, var5);
            var9 = var4.a(28276, var2);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var9 < var11) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_c[var11];
                  if ((var11 ^ -1) != (var8 ^ -1)) {
                    stackIn_8_0 = var12.field_a[0];
                    break L2;
                  } else {
                    stackIn_8_0 = var4.a((byte) -113, var5);
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_8_0;
                  if (var11 != var9) {
                    if (var12 == null) {
                      stackIn_13_0 = 0;
                      break L3;
                    } else {
                      stackIn_13_0 = var12.field_a[var12.field_a.length + -1];
                      break L3;
                    }
                  } else {
                    stackIn_13_0 = var4.a((byte) -127, var2);
                    break L3;
                  }
                }
                L4: {
                  var14 = stackIn_13_0;
                  var15 = new wl(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(2), var12.field_c + -var12.field_d));
                  if (var10 != null) {
                    ((wl) (var10)).field_p = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_K.b(114, var15);
                var10 = var15;
                var11++;
                continue L1;
              }
            }
          } else {
            if (param0) {
              return;
            } else {
              discarded$0 = this.a(68, true, 35);
              return;
            }
          }
        }
    }

    void a(byte param0, w param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            super.a(param0, param1, param2, param3);
            this.field_I = null;
            if (this.field_m) {
                var5_int = -this.field_t + -param3 + bk.field_b;
                var6 = -this.field_o + sh.field_e - param2;
                this.field_I = this.a(var6, false, var5_int);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bc.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        wl discarded$0 = null;
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = Lexicominos.field_L ? 1 : 0;
        try {
            if (param2 != -27371) {
                discarded$0 = this.a(-40, false, -28);
            }
            if (this.field_G == null || param1 >= this.field_G.length) {
                var7 = new String[1 + param1];
                var8 = var7;
                String[] var4 = var8;
                if (!(null == this.field_G)) {
                    for (var5 = 0; this.field_G.length > var5; var5++) {
                        var7[var5] = this.field_G[var5];
                    }
                }
                this.field_G = var8;
            }
            this.field_G[param1] = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bc.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final wl a(int param0, boolean param1, int param2) {
        wl var4;
        wl var5;
        int var6;
        var6 = Lexicominos.field_L ? 1 : 0;
        var4 = (wl) ((Object) this.field_K.a(true));
        if (!param1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (wl) ((Object) this.field_K.f(2));
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_j > param2) {
                      break L2;
                    } else {
                      if (var5.field_k > param0) {
                        break L2;
                      } else {
                        if (var5.field_l + var5.field_j <= param2) {
                          break L2;
                        } else {
                          if (var5.field_k + var5.field_h < param0) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_p;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return (wl) null;
        }
    }

    public static void e(boolean param0) {
        field_L = null;
        if (param0) {
          bc.e(true);
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        } else {
          field_H = null;
          field_E = null;
          field_J = null;
          field_F = null;
          return;
        }
    }

    String b(int param0) {
        if (null != this.field_I) {
          if (this.field_G != null) {
            if (param0 >= 121) {
              if (this.field_G.length <= this.field_I.field_o) {
                return null;
              } else {
                return this.field_G[this.field_I.field_o];
              }
            } else {
              return (String) null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                bc.e(true);
                break L1;
              }
            }
            L2: {
              stackIn_4_0 = 10;

              if (param0) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 0;
                break L2;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 1;
                break L2;
              }
            }
            stackIn_6_0 = rk.a(stackIn_5_0, stackIn_5_1 != 0, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("bc.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    boolean a(byte param0, w param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 44) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var4 = (CharSequence) null;
              bc.a(false, (CharSequence) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bc.LA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param2 != -2) {
          this.b(35);
          this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
          return;
        } else {
          this.a(((ub) ((Object) this.field_i)).a(-13293, (w) (this)), param3, true, param1, param0);
          return;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        wl var6;
        int var7;
        int var8;
        ub var9;
        super.a(param0, param1, param2, param3);
        if (-1 != (param3 ^ -1)) {
          return;
        } else {
          var9 = (ub) ((Object) this.field_i);
          var6 = this.field_I;
          if (var6 == null) {
            return;
          } else {
            var7 = var9.b((w) (this), 102, param2);
            var8 = var9.a((w) (this), 20340, param1);
            L0: while (true) {
              pk.a(var6.field_h + 2, -2 + (var8 + var6.field_k), var7 - -var6.field_j - 2, param0 ^ -116, var6.field_l + 2);
              var6 = var6.field_p;
              if (var6 != null) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    bc(String param0, rd param1) {
        super(param0, (vd) null);
        this.field_I = null;
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "bc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        super.a(param0, param1, true, param3, param4);
        this.f(param2);
    }

    static {
        field_J = "More suggestions";
        field_E = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_H = new fi(1);
        field_L = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = new dg();
    }
}
