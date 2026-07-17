/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends rb {
    static jb field_p;
    private int field_q;
    private fc field_l;
    static pa[] field_n;
    static long field_o;
    static vd[] field_m;

    public static void l(byte param0) {
        field_m = null;
        field_n = null;
        field_p = null;
        dl.l((byte) -94);
    }

    final void g(int param0, int param1) {
        if (param0 < 35) {
          return;
        } else {
          int fieldTemp$2 = ((dl) this).field_g;
          ((dl) this).field_g = ((dl) this).field_g + 1;
          ((dl) this).field_f[fieldTemp$2] = (byte)(((dl) this).field_l.b(256) + param1);
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                field_o = 102L;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                int fieldTemp$5 = ((dl) this).field_g;
                ((dl) this).field_g = ((dl) this).field_g + 1;
                param0[param2 + var5_int] = (byte)(((dl) this).field_f[fieldTemp$5] + -((dl) this).field_l.b(256));
                var5_int++;
                if (var6 == 0) {
                  continue L2;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("dl.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void j(int param0) {
        ((dl) this).field_q = 8 * ((dl) this).field_g;
        int var2 = -79 / ((-15 - param0) / 44);
    }

    final void m(byte param0) {
        ((dl) this).field_g = (((dl) this).field_q + 7) / 8;
        if (param0 <= 33) {
            field_n = null;
        }
    }

    dl(byte[] param0) {
        super(param0);
    }

    final static String k(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var6 = "(" + ga.field_l + " " + kg.field_b + " " + hi.field_w + ") " + qs.field_b;
        if (ag.field_s > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (ag.field_s > var2) {
              var7 = var1 + 32;
              var3 = nm.field_c.field_f[var2] & 255;
              var4 = var3 >> 4;
              var10 = 10;
              var9 = var4;
              if (var5 != 0) {
                if (var9 != var10) {
                  String discarded$4 = dl.k((byte) -78);
                  return var7;
                } else {
                  return var7;
                }
              } else {
                L1: {
                  L2: {
                    if (var9 >= var10) {
                      break L2;
                    } else {
                      var4 += 48;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4 += 55;
                  break L1;
                }
                L3: {
                  L4: {
                    var3 = var3 & 15;
                    if (var3 >= 10) {
                      break L4;
                    } else {
                      var3 += 48;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 += 55;
                  break L3;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
                var2++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  String discarded$5 = dl.k((byte) -78);
                  return var1;
                }
              }
            } else {
              String discarded$6 = dl.k((byte) -78);
              return var1;
            }
          }
        } else {
          String discarded$7 = dl.k((byte) -78);
          return var6;
        }
    }

    final void a(boolean param0, int[] param1) {
        try {
            if (!param0) {
                Object var4 = null;
                ((dl) this).a(true, (int[]) null);
            }
            ((dl) this).field_l = new fc(param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "dl.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    dl(int param0) {
        super(param0);
    }

    final int j(byte param0) {
        if (param0 > -1) {
          field_p = null;
          int fieldTemp$4 = ((dl) this).field_g;
          ((dl) this).field_g = ((dl) this).field_g + 1;
          return 255 & ((dl) this).field_f[fieldTemp$4] - ((dl) this).field_l.b(256);
        } else {
          int fieldTemp$5 = ((dl) this).field_g;
          ((dl) this).field_g = ((dl) this).field_g + 1;
          return 255 & ((dl) this).field_f[fieldTemp$5] - ((dl) this).field_l.b(256);
        }
    }

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var3 = ((dl) this).field_q >> 3;
        var4 = 8 - (((dl) this).field_q & 7);
        var6 = 97 / ((17 - param0) / 60);
        ((dl) this).field_q = ((dl) this).field_q + param1;
        var5 = 0;
        L0: while (true) {
          if (param1 > var4) {
            int incrementValue$1 = var3;
            var3++;
            var5 = var5 + ((kp.field_f[var4] & ((dl) this).field_f[incrementValue$1]) << param1 + -var4);
            param1 = param1 - var4;
            var4 = 8;
            if (var7 == 0) {
              continue L0;
            } else {
              var5 = var5 + (((dl) this).field_f[var3] >> -param1 + var4 & kp.field_f[param1]);
              return var5;
            }
          } else {
            L1: {
              L2: {
                if (param1 != var4) {
                  break L2;
                } else {
                  var5 = var5 + (kp.field_f[var4] & ((dl) this).field_f[var3]);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = var5 + (((dl) this).field_f[var3] >> -param1 + var4 & kp.field_f[param1]);
              break L1;
            }
            return var5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new jb();
    }
}
