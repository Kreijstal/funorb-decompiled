/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private oa[] field_b;
    static String field_e;
    private java.math.BigInteger field_a;
    private dk field_f;
    static String field_d;
    static String field_g;
    private java.math.BigInteger field_j;
    private sb field_i;
    private ub field_h;
    private jc field_c;

    public static void a(int param0) {
        if (param0 < 22) {
            field_g = null;
        }
        field_g = null;
        field_e = null;
        field_d = null;
    }

    ha(dk param0, sb param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, boolean param4, int param5, int param6, boolean param7, boolean param8) {
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          if (param2) {
            break L0;
          } else {
            L1: {
              if (eb.field_f != df.field_e) {
                break L1;
              } else {
                if (df.field_f == f.field_b) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (ca.field_M.field_b != df.field_f) {
              break L0;
            } else {
              if (ca.field_M.field_c != df.field_e) {
                break L0;
              } else {
                if (null == wl.field_d) {
                  if (la.field_h != null) {
                    hm.a(true, true);
                    break L0;
                  } else {
                    id.b(-124);
                    break L0;
                  }
                } else {
                  hm.a(false, true);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (!param2) {
            oh.field_f = (-640 + eb.field_f) / 2;
            break L2;
          } else {
            oh.field_f = o.field_e;
            break L2;
          }
        }
        L3: {
          ca.b(param2, -116);
          if (0 < kh.field_d) {
            of.a(11, false, param2, param8);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          jk.field_b.field_z = da.field_n.field_z;
          jk.field_b.field_lb = 1;
          if (hn.field_h <= 0) {
            break L4;
          } else {
            eb.a(false, param2, 11, param8);
            break L4;
          }
        }
        L5: {
          if (th.field_z <= 0) {
            break L5;
          } else {
            qk.a(param2, 11, (byte) 80, param8, param7);
            break L5;
          }
        }
        L6: {
          L7: {
            if (!ad.field_h) {
              break L7;
            } else {
              if (wl.field_d.field_ic >= wl.field_d.field_vc) {
                uf.field_j.field_Eb.field_V = oc.field_h;
                ij.field_m.field_Y = false;
                ak.a(16377, uf.field_j.field_Jb);
                break L6;
              } else {
                break L7;
              }
            }
          }
          uf.field_j.field_Eb.field_V = null;
          ij.field_m.field_Y = true;
          int discarded$2 = 21547;
          lb.a(param6, 11, uf.field_j, param1);
          break L6;
        }
        pi.a(true, param6, 16777215, (byte) -106, 16777215, 11, param1);
        int discarded$3 = 21547;
        lb.a(param6, 11, wm.field_r, param1);
        var10 = -92;
        rl.field_y = rl.field_y + 1;
    }

    final oa a(int param0, int param1, boolean param2, gl param3, gl param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        oa var9 = null;
        byte[] var13 = null;
        oa stackIn_9_0 = null;
        oa stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        oa stackOut_10_0 = null;
        oa stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (null == ((ha) this).field_c) {
              throw new RuntimeException();
            } else {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (((ha) this).field_b.length <= param1) {
                    break L1;
                  } else {
                    if (null == ((ha) this).field_b[param1]) {
                      ((ha) this).field_c.field_l = param0 * param1 + 6;
                      var6_int = ((ha) this).field_c.d((byte) 120);
                      var7 = ((ha) this).field_c.d((byte) 114);
                      var13 = new byte[64];
                      ((ha) this).field_c.a(0, 64, true, var13);
                      var9 = new oa(param1, param4, param3, ((ha) this).field_f, ((ha) this).field_i, var6_int, var13, var7, param2);
                      ((ha) this).field_b[param1] = var9;
                      stackOut_10_0 = (oa) var9;
                      stackIn_11_0 = stackOut_10_0;
                      break L0;
                    } else {
                      stackOut_8_0 = ((ha) this).field_b[param1];
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("ha.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param2 == 0) {
            if (param0 == 0) {
                return 0;
            }
            if (0 <= param0) {
                return 2048;
            }
            return -2048;
        }
        if (0 > param2) {
            if (param0 == 0) {
                return 4096;
            }
            if (0 > param0) {
                int discarded$0 = -1550172208;
                return -4096 + ph.a(-param2, -param0);
            }
            int discarded$1 = -1550172208;
            return 4096 + -ph.a(-param2, param0);
        }
        if (0 == param0) {
            return 0;
        }
        if (param0 >= 0) {
            int discarded$2 = -1550172208;
            return ph.a(param2, param0);
        }
        int discarded$3 = -1550172208;
        return -ph.a(param2, -param0);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(og.a(-1, param1, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (null != ((ha) this).field_b) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((ha) this).field_b.length) {
              L1: {
                if (param0 <= -111) {
                  break L1;
                } else {
                  ((ha) this).field_h = null;
                  break L1;
                }
              }
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((ha) this).field_b.length) {
                  return;
                } else {
                  if (((ha) this).field_b[var4] != null) {
                    ((ha) this).field_b[var4].b((byte) -28);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((ha) this).field_b[var2] != null) {
                ((ha) this).field_b[var2].c(0);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, da param1) {
        hg var5 = null;
        int var4 = 0;
        try {
            var5 = gk.field_g;
            var5.g(param0, 8);
            var5.field_l = var5.field_l + 1;
            var4 = var5.field_l;
            var5.a(1, 84);
            var5.a(param1.field_p, 68);
            var5.c(param1.field_q, (byte) -102);
            var5.a(param1.field_o, (byte) -42);
            var5.a(param1.field_l, (byte) -42);
            var5.a(param1.field_j, (byte) -42);
            var5.a(param1.field_m, (byte) -42);
            int discarded$0 = var5.b((byte) -111, var4);
            var5.b(var5.field_l + -var4, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "ha.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + -38 + 41);
        }
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        jc var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        if (null == ((ha) this).field_c) {
          L0: {
            if (null == ((ha) this).field_h) {
              if (((ha) this).field_f.c((byte) 113)) {
                return false;
              } else {
                ((ha) this).field_h = ((ha) this).field_f.a((byte) 0, 255, true, -1150070304, 255);
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (!((ha) this).field_h.field_t) {
            L1: {
              var10 = new jc(((ha) this).field_h.b((byte) 39));
              var10.field_l = 5;
              var3 = var10.g(param0 + 11113);
              var10.field_l = var10.field_l + 72 * var3;
              if (param0 == 19) {
                break L1;
              } else {
                ((ha) this).field_b = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var16 = new byte[var10.field_g.length + -var10.field_l];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(0, var16.length, true, var16);
                if (((ha) this).field_j == null) {
                  break L3;
                } else {
                  if (((ha) this).field_a == null) {
                    break L3;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((ha) this).field_j, ((ha) this).field_a);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L2;
                  }
                }
              }
              var5 = var4;
              break L2;
            }
            if (var5.length != 65) {
              throw new RuntimeException();
            } else {
              int discarded$1 = 0;
              var17 = ug.a(var10.field_g, var10.field_l - (var16.length - -5), 5);
              var7 = 0;
              L4: while (true) {
                if (64 <= var7) {
                  ((ha) this).field_b = new oa[var3];
                  ((ha) this).field_c = var10;
                  return true;
                } else {
                  if (var17[var7] == var5[1 + var7]) {
                    var7++;
                    continue L4;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private ha(dk param0, sb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
              ((ha) this).field_a = param3;
              ((ha) this).field_i = param1;
              ((ha) this).field_f = param0;
              ((ha) this).field_j = param2;
              if (((ha) this).field_f.c((byte) 113)) {
                break L1;
              } else {
                ((ha) this).field_h = ((ha) this).field_f.a((byte) 0, 255, true, -1150070304, 255);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ha.<init>(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Account created successfully!";
        field_g = "Enter multiplayer lobby";
        field_d = "Send private message to <%0>";
    }
}
