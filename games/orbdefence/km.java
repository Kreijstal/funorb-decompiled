/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    private im field_c;
    static String field_b;
    private ca field_a;

    final static boolean a(boolean param0) {
        if (param0) {
            km.a(62);
            return null != mg.field_k ? true : wg.field_o;
        }
        return null != mg.field_k ? true : wg.field_o;
    }

    final static void a(int param0) {
        wl.a(uj.b((byte) -120), (byte) 67);
        if (param0 != 16711935) {
            km.a(83);
        }
    }

    final ca b(boolean param0) {
        ca var2 = null;
        var2 = ((km) this).field_a;
        if (((km) this).field_c.field_d != var2) {
          ((km) this).field_a = var2.field_e;
          if (!param0) {
            return null;
          } else {
            return var2;
          }
        } else {
          ((km) this).field_a = null;
          return null;
        }
    }

    final ca b(ca param0, byte param1) {
        ca var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((km) this).field_c.field_d.field_c;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (((km) this).field_c.field_d != var3) {
          ((km) this).field_a = var3.field_c;
          if (param1 > -114) {
            return null;
          } else {
            return var3;
          }
        } else {
          ((km) this).field_a = null;
          return null;
        }
    }

    final static void a(byte param0, int param1) {
        og.field_b = 100 * param1 / 150;
        og.field_o = 400 * param1 / 150;
        if (param0 > -18) {
          return;
        } else {
          og.field_a = (param1 << 932598544) / 150;
          return;
        }
    }

    final ca a(byte param0) {
        ca var2 = null;
        if (param0 < -69) {
          var2 = ((km) this).field_a;
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_c;
            return var2;
          }
        } else {
          ((km) this).field_a = null;
          var2 = ((km) this).field_a;
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_c;
            return var2;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        var7 = param4 + ul.field_f * param3;
        var8 = param2 & 16711935;
        param2 = param2 & 65280;
        var9 = 0;
        if (param1 > 53) {
          L0: while (true) {
            if (param6 <= var9) {
              return;
            } else {
              var10 = (1 + var9) * (-param5 + param0) / (1 + param6) + param5;
              var11 = ul.field_b[var7];
              var12 = 16711935 & var11;
              var11 = var11 & 65280;
              var12 = (var8 * var10 & -16711936) + ((256 - var10) * var12 & -16711936);
              var11 = (16711680 & var10 * param2) - -(16711680 & (-var10 + 256) * var11);
              var7++;
              ul.field_b[var7] = ge.a(var12, var11) >>> -1215909112;
              var9++;
              continue L0;
            }
          }
        } else {
          field_b = null;
          L1: while (true) {
            if (param6 <= var9) {
              return;
            } else {
              var10 = (1 + var9) * (-param5 + param0) / (1 + param6) + param5;
              var11 = ul.field_b[var7];
              var12 = 16711935 & var11;
              var11 = var11 & 65280;
              var12 = (var8 * var10 & -16711936) + ((256 - var10) * var12 & -16711936);
              var11 = (16711680 & var10 * param2) - -(16711680 & (-var10 + 256) * var11);
              var7++;
              ul.field_b[var7] = ge.a(var12, var11) >>> -1215909112;
              var9++;
              continue L1;
            }
          }
        }
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == nk.field_q) {
                        statePc = 8;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var1 = (Object) (Object) nk.field_q;
                    // monitorenter nk.field_q
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    try {
                        nk.field_q = null;
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    if (param0 < -39) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    field_b = null;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    if (param0 >= -39) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return;
                }
                case 10: {
                    field_b = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(long param0, int param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param0);
        } catch (InterruptedException interruptedException) {
        }
        if (param1 != -25680) {
            km.b(-100);
            return;
        }
    }

    final ca d(int param0) {
        ca var2 = null;
        var2 = ((km) this).field_c.field_d.field_e;
        if (param0 == 27935) {
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_e;
            return var2;
          }
        } else {
          ((km) this).field_c = null;
          if (((km) this).field_c.field_d == var2) {
            ((km) this).field_a = null;
            return null;
          } else {
            ((km) this).field_a = var2.field_e;
            return var2;
          }
        }
    }

    public static void e(int param0) {
        field_b = null;
        if (param0 <= 89) {
            km.a((byte) 49, 77);
        }
    }

    final ca a(ca param0, byte param1) {
        ca var3 = null;
        if (param0 == null) {
            var3 = ((km) this).field_c.field_d.field_e;
        } else {
            var3 = param0;
        }
        if (param1 != -1) {
            boolean discarded$7 = km.a(true);
            if (!(((km) this).field_c.field_d != var3)) {
                ((km) this).field_a = null;
                return null;
            }
            ((km) this).field_a = var3.field_e;
            return var3;
        }
        if (!(((km) this).field_c.field_d != var3)) {
            ((km) this).field_a = null;
            return null;
        }
        ((km) this).field_a = var3.field_e;
        return var3;
    }

    km(im param0) {
        ((km) this).field_c = param0;
    }

    final ca c(int param0) {
        ca var2 = null;
        var2 = ((km) this).field_c.field_d.field_c;
        if (var2 == ((km) this).field_c.field_d) {
          ((km) this).field_a = null;
          return null;
        } else {
          ((km) this).field_a = var2.field_c;
          if (param0 != -7651) {
            field_b = null;
            return var2;
          } else {
            return var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Invalid password.";
    }
}
