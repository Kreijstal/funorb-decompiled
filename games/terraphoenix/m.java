/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    static String field_h;
    private int field_f;
    private int[][] field_d;
    static String field_e;
    static String field_a;
    static String field_b;
    static ci field_g;
    private int field_c;

    final static int a(int param0) {
        int var1 = 0;
        int var2 = Terraphoenix.field_V;
        boolean discarded$8 = jl.field_I.a(true, qf.field_c, wd.field_a, 115);
        jl.field_I.i((byte) 126);
        if (param0 != 1) {
            return -58;
        }
        while (fd.d(1)) {
            boolean discarded$9 = jl.field_I.a(lf.field_c, ua.field_g, (byte) -121);
        }
        if (!((ga.field_c ^ -1) == 0)) {
            var1 = ga.field_c;
            bm.a(-1, (byte) 1);
            return var1;
        }
        if (!(!fd.field_k)) {
            return 3;
        }
        if (pe.field_a == ua.field_d) {
            return 1;
        }
        if (!vc.field_a.a(-109)) {
            return 1;
        }
        if (!(ua.field_d != qe.field_f)) {
            return 2;
        }
        return -1;
    }

    final int a(int param0, boolean param1) {
        if (!param1) {
            ((m) this).field_d = null;
        }
        if (!(null == ((m) this).field_d)) {
            param0 = (int)((long)((m) this).field_f * (long)param0 / (long)((m) this).field_c);
        }
        return param0;
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 <= 63) {
            field_a = null;
        }
        field_e = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2, int param3) {
        try {
            java.net.MalformedURLException var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (he.field_o.startsWith("win")) {
                            statePc = 2;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (!ue.a(param2, 0)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                            if (param3 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            int discarded$2 = m.a(-14);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        bd.a((Throwable) null, "MGR1: " + param2, param3 ^ -114);
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 46) {
            int discarded$0 = ((m) this).a(43, false);
        }
        if (!(null == ((m) this).field_d)) {
            param1 = (int)((long)((m) this).field_f * (long)param1 / (long)((m) this).field_c) + 6;
        }
        return param1;
    }

    final byte[] a(byte param0, byte[] param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var11 = Terraphoenix.field_V;
        if (param0 == 109) {
          L0: {
            if (null != ((m) this).field_d) {
              var3 = 14 + (int)((long)param1.length * (long)((m) this).field_f / (long)((m) this).field_c);
              var20 = new int[var3];
              var18 = var20;
              var16 = var18;
              var14 = var16;
              var4 = var14;
              var5 = 0;
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (param1.length <= var7) {
                  param1 = new byte[var3];
                  var12 = 0;
                  var7 = var12;
                  L2: while (true) {
                    if (var3 <= var12) {
                      break L0;
                    } else {
                      var8 = 32768 + var20[var12] >> 1289808848;
                      if (var8 > 127) {
                        param1[var12] = (byte)-128;
                        var12++;
                        continue L2;
                      } else {
                        if (-128 >= var8) {
                          param1[var12] = (byte)var8;
                          var12++;
                          continue L2;
                        } else {
                          param1[var12] = (byte)127;
                          var12++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  var8 = param1[var7];
                  var19 = ((m) this).field_d[var6];
                  var10 = 0;
                  L3: while (true) {
                    if (14 <= var10) {
                      var6 = var6 + ((m) this).field_f;
                      var10 = var6 / ((m) this).field_c;
                      var5 = var5 + var10;
                      var6 = var6 - ((m) this).field_c * var10;
                      var7++;
                      continue L1;
                    } else {
                      var4[var10 + var5] = var4[var10 + var5] + var19[var10] * var8;
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    m(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = ge.a(-1, param1, param0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((m) this).field_d = new int[param0][14];
          ((m) this).field_f = param1;
          ((m) this).field_c = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
            } else {
              L1: {
                var5 = ((m) this).field_d[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (-7.0 + var6));
                if (0 <= var8) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var8 >= var9) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = 3.141592653589793 * ((double)var8 - var6);
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + Math.cos((-var6 + (double)var8) * 0.2243994752564138) * 0.46);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Not enough time to fire";
        field_b = "Efficency";
        field_e = null;
        field_a = "Increase grenade number";
    }
}
