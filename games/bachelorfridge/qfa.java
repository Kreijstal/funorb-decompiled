/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qfa extends cga {
    lu field_v;
    int field_u;
    static String field_w;
    byte field_s;
    static String field_t;

    final static String a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var10 = new char[var2_int];
            var9 = var10;
            var8 = var9;
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_23_0 = new String(var10);
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param1.charAt(var4);
                    if (65 > var5) {
                      break L4;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(97 + (-65 + var5));
                        var4++;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var5 < 97) {
                        break L6;
                      } else {
                        if (var5 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (var5 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3[var4] = '_';
                    var4++;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("qfa.S(").append(20).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    final int e(int param0) {
        if (((qfa) this).field_v != null) {
          if (param0 != -6298) {
            field_w = null;
            return ((qfa) this).field_v.field_g * 100 / (-((qfa) this).field_s + ((qfa) this).field_v.field_h.length);
          } else {
            return ((qfa) this).field_v.field_g * 100 / (-((qfa) this).field_s + ((qfa) this).field_v.field_h.length);
          }
        } else {
          return 0;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, String param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              qc.field_b.field_Z = param5;
              if (2 != gk.field_d) {
                qq.field_k.field_Z = ro.field_k;
                break L1;
              } else {
                qq.field_k.field_Z = ru.field_l;
                break L1;
              }
            }
            var9_int = 495;
            var10 = 5;
            aja.field_p.a(param4, 31407, -10 + var9_int, 5, var10);
            jba.field_A.a(param4, 31407, aja.field_p.field_sb - ts.field_r.field_sb, 0, 0);
            var10 = var10 + (param4 - -param0);
            ts.field_r.a(param4, 31407, ts.field_r.field_sb, jba.field_A.field_sb, 0);
            ub.field_k.a(param1, 31407, ub.field_k.e(-1), 5, var10);
            var11 = qq.field_k.e(-1);
            qq.field_k.a(param1, 31407, var11, -var11 + (var9_int - 5), var10);
            var12 = param1 + (var10 - -5);
            qc.field_b.a(20, 31407, var9_int, 0, 0);
            tga.field_m.a(var12, 31407, var9_int, 0, 20);
            tga.field_m.field_eb = mu.a(11579568, 3, tga.field_m.field_p, 8421504, 2105376, (byte) 17);
            var12 = var12 + 20;
            bi.field_h.a(var12, 31407, var9_int, param2 + -(var9_int / 2), -(var12 / 2) + param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("qfa.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(-115).append(',').append(param4).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param6 + ',' + param7 + ',' + 20 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var4 = var2;
                    var4 = var2;
                    if (param1 < -18) {
                      break L1;
                    } else {
                      field_t = null;
                      break L1;
                    }
                  }
                  L2: {
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (var3 < 0) {
                      break L2;
                    } else {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(ow.a(var5, (byte) -107, param0), "_self");
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
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var2_ref2;
                stackOut_8_1 = new StringBuilder().append("qfa.N(");
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param0 == null) {
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
              throw pe.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qfa() {
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_6_0 = null;
        String stackOut_13_0 = null;
        String stackOut_20_0 = null;
        String stackOut_27_0 = null;
        String stackOut_23_0 = null;
        String stackOut_16_0 = null;
        String stackOut_9_0 = null;
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
            if (param0 == 3) {
              stackOut_2_0 = lda.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 == 6) {
                stackOut_6_0 = ed.field_c;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 != 7) {
                  if (param0 == 8) {
                    stackOut_13_0 = hr.field_e;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (param0 != 9) {
                      if (param0 == 10) {
                        stackOut_20_0 = wm.field_l;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        if (param0 != 11) {
                          if (param0 == 14) {
                            stackOut_27_0 = lga.a(true, new String[1], vfa.field_r);
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            return null;
                          }
                        } else {
                          stackOut_23_0 = nla.field_e;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    } else {
                      stackOut_16_0 = bm.field_m;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                } else {
                  stackOut_9_0 = vc.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("qfa.O(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L1;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + -83 + ')');
        }
        return stackIn_28_0;
    }

    public static void g(int param0) {
        field_w = null;
        field_t = null;
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        bga var4_ref_bga = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        fm var9 = null;
        pf var10 = null;
        byte[] var14 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            var10 = ig.field_m;
            var2 = var10.b(16711935);
            if (0 == var2) {
              var9 = (fm) (Object) us.field_e.b((byte) 90);
              if (var9 == null) {
                vc.a((byte) -118);
                return;
              } else {
                L1: {
                  var4 = var10.b(16711935);
                  if (0 == var4) {
                    var5 = null;
                    break L1;
                  } else {
                    var14 = new byte[var4];
                    var10.a(var14, var4, 128, 0);
                    break L1;
                  }
                }
                var10.field_g = var10.field_g + 4;
                if (var10.j(4)) {
                  var9.a(false);
                  break L0;
                } else {
                  vc.a((byte) -124);
                  return;
                }
              }
            } else {
              if (var2 == 1) {
                var3 = var10.f(-108);
                var4_ref_bga = (bga) (Object) on.field_r.b((byte) 90);
                L2: while (true) {
                  L3: {
                    if (var4_ref_bga == null) {
                      break L3;
                    } else {
                      if (var4_ref_bga.field_i != var3) {
                        var4_ref_bga = (bga) (Object) on.field_r.c(0);
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4_ref_bga == null) {
                    vc.a((byte) -80);
                    return;
                  } else {
                    var4_ref_bga.a(false);
                    return;
                  }
                }
              } else {
                cv.a(1, "A1: " + nia.d((byte) -108), (Throwable) null);
                vc.a((byte) -115);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "qfa.L(" + -63 + ')');
        }
    }

    final static void i(int param0) {
        pf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                field_t = null;
                break L1;
              }
            }
            var1 = sja.field_fb;
            L2: while (true) {
              if (!tg.c(-43)) {
                break L0;
              } else {
                var1.c(8, (byte) 119);
                int fieldTemp$5 = var1.field_g + 1;
                var1.field_g = var1.field_g + 1;
                var2 = fieldTemp$5;
                sia.a(var1, 108);
                sja.field_fb.b((byte) -68, var1.field_g - var2);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1_ref, "qfa.P(" + param0 + ')');
        }
    }

    final static void f(int param0) {
        qi.field_b = new ue();
        kka.field_l.e((wj) (Object) qi.field_b, 33);
        int var1 = -78 / ((param0 - 45) / 53);
    }

    final byte[] d(byte param0) {
        if (!((qfa) this).field_n) {
          if (-((qfa) this).field_s + ((qfa) this).field_v.field_h.length <= ((qfa) this).field_v.field_g) {
            if (param0 != -65) {
              qfa.i(1);
              return ((qfa) this).field_v.field_h;
            } else {
              return ((qfa) this).field_v.field_h;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "***Ignored!***";
        field_t = "Player";
    }
}
