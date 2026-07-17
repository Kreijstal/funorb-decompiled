/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class db extends gj {
    boolean field_G;
    static int field_H;
    static dd field_I;
    static String field_F;
    static la field_J;
    private f field_L;
    private int field_K;

    final void a(int param0, byte param1, int param2) {
        ((db) this).a(-param2 + ll.field_m >> 1, param2, -param0 + ca.field_Q >> 1, param0, 80);
        if (param1 > -126) {
            field_J = null;
        }
    }

    boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var2 = -3 / ((param0 - 38) / 49);
          var3 = this.e((byte) -48);
          var4 = -((db) this).field_K + var3;
          if (var4 <= 0) {
            break L0;
          } else {
            ((db) this).field_K = ((db) this).field_K + (var4 + 7) / 8;
            break L0;
          }
        }
        L1: {
          if (var4 >= 0) {
            break L1;
          } else {
            ((db) this).field_K = ((db) this).field_K + (-15 + var4) / 16;
            break L1;
          }
        }
        L2: {
          L3: {
            if (((db) this).field_K != 0) {
              break L3;
            } else {
              if (var3 != 0) {
                break L3;
              } else {
                if (((db) this).field_G) {
                  break L3;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    db(f param0, int param1, int param2) {
        super(-param1 + ll.field_m >> 1, -param2 + ca.field_Q >> 1, param1, param2, (ch) null);
        try {
            ((db) this).field_L = param0;
            ((db) this).field_G = false;
            ((db) this).field_K = 0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "db.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        if (-1 == ((db) this).field_K) {
          return;
        } else {
          if (-257 <= ((db) this).field_K) {
            if (param3 == 0) {
              ((db) this).b(param0 + ((db) this).field_z, param1 + ((db) this).field_y, 17344);
              super.b(param0, param1, true, param3);
              return;
            } else {
              return;
            }
          } else {
            L0: {
              L1: {
                if (null == ok.field_y) {
                  break L1;
                } else {
                  if (((db) this).field_u > ok.field_y.field_w) {
                    break L1;
                  } else {
                    if (ok.field_y.field_t >= ((db) this).field_j) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              ok.field_y = new dd(((db) this).field_u, ((db) this).field_j);
              break L0;
            }
            r.a(ok.field_y, 45);
            gb.c();
            ((db) this).b(0, 0, 17344);
            super.b(-param0 + -((db) this).field_z, -param1 - ((db) this).field_y, param2, param3);
            ia.a(-62);
            ok.field_y.c(((db) this).field_y + param1, ((db) this).field_z + param0, ((db) this).field_K);
            return;
          }
        }
    }

    boolean j(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          ((db) this).field_K = this.e((byte) -122);
          if (param0 > 70) {
            break L0;
          } else {
            ((db) this).field_L = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((db) this).field_K != 0) {
              break L2;
            } else {
              if (((db) this).field_G) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    abstract void b(int param0, int param1, int param2);

    private final int e(byte param0) {
        if (param0 >= -41) {
            return -17;
        }
        return !((db) this).field_G ? 0 : (Object) (Object) ((db) this).field_L.l(-87) == this ? 256 : 0;
    }

    final static String a(String param0, String[] param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (var6_int >= 0) {
                var5 = 2 + var6_int;
                L2: while (true) {
                  L3: {
                    if (var3_int <= var5) {
                      break L3;
                    } else {
                      if (!em.a((byte) -108, param0.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int - -2, var5);
                  if (!ii.a(12969, (CharSequence) (Object) var7_ref_String)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (62 != param0.charAt(var5)) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = pl.a((CharSequence) (Object) var7_ref_String, -9816);
                        var4 = var4 + (param1[var8].length() + (var6_int + -var5));
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L4: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (var8 < 0) {
                    L5: {
                      if (param2) {
                        break L5;
                      } else {
                        field_J = null;
                        break L5;
                      }
                    }
                    StringBuilder discarded$3 = var6.append(param0.substring(var7));
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  } else {
                    var5 = var8 - -2;
                    L6: while (true) {
                      L7: {
                        if (var5 >= var3_int) {
                          break L7;
                        } else {
                          if (!em.a((byte) -71, param0.charAt(var5))) {
                            break L7;
                          } else {
                            var5++;
                            continue L6;
                          }
                        }
                      }
                      var9 = param0.substring(var8 - -2, var5);
                      if (ii.a(12969, (CharSequence) (Object) var9)) {
                        if (var5 >= var3_int) {
                          continue L4;
                        } else {
                          if (62 == param0.charAt(var5)) {
                            var5++;
                            var10 = pl.a((CharSequence) (Object) var9, -9816);
                            StringBuilder discarded$4 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            StringBuilder discarded$5 = var6.append(param1[var10]);
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      } else {
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("db.QA(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L9;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param2 + 41);
        }
        return stackIn_27_0;
    }

    final qa i(int param0) {
        if (param0 != -257) {
            Object var3 = null;
            String discarded$0 = db.a((String) null, (String[]) null, false);
        }
        qa var2 = super.i(param0);
        if (var2 != null) {
            return var2;
        }
        return (qa) this;
    }

    final static int a(byte param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 > 0) {
              if (mc.a(param2, (byte) -124)) {
                stackOut_5_0 = (int)(((long)param1.nextInt() & 4294967295L) * (long)param2 >> 32);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                L1: {
                  var3_int = -2147483648 + -(int)(4294967296L % (long)param2);
                  if (param0 == -115) {
                    break L1;
                  } else {
                    field_F = null;
                    break L1;
                  }
                }
                L2: while (true) {
                  var4 = param1.nextInt();
                  if (var4 >= var3_int) {
                    continue L2;
                  } else {
                    stackOut_10_0 = gk.a(param2, true, var4);
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("db.RA(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    public static void k(int param0) {
        field_F = null;
        field_J = null;
        field_I = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 0;
        field_F = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
